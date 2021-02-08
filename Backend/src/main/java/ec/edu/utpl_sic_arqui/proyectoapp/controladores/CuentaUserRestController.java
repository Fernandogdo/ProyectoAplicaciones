package ec.edu.utpl_sic_arqui.proyectoapp.controladores;

import java.util.List;
import ec.edu.utpl_sic_arqui.proyectoapp.adapters.ICuentaAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.ICuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cuenta;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarCuentaUsuario;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CuentaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class CuentaUserRestController {

    @Autowired
    private RegistrarCuentaUsuario cuentaRT;

    @GetMapping("/cuentaUser/{email}")
    public ResponseEntity<?> BuscarByEmail(@PathVariable String email) {
        
        CuentaModel cuentaModel = null;
        Map<String, Object> response = new HashMap<>();

        try {
            cuentaModel = cuentaRT.BuscarCuentaID(email);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (cuentaModel == null) {
            response.put("mensaje", "La cuenta: ".concat(email.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<CuentaModel>(cuentaModel, HttpStatus.OK);
    }

    @PostMapping("/cuentaUser")
    public ResponseEntity<?> create(@Valid @RequestBody Cuenta cuenta, BindingResult result) {
        
        CuentaModel cuentaModelNew = null;
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()) {

            List<String> errors = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '" + err.getField() + "' " + err.getDefaultMessage())
                    .collect(Collectors.toList());

            response.put("errors", errors);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
        }

        try {

            cuentaModelNew = cuentaRT.registrarCuenta(cuenta);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El estado ha sido creado con éxito!");
        response.put("estado", cuentaModelNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
    
    
     
}
