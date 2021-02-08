package ec.edu.utpl_sic_arqui.proyectoapp.controladores;

import com.fasterxml.jackson.databind.ObjectMapper;
import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstablecimientoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Establecimiento;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.RegistrarInformacionEstablecimiento;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstablecimientoModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class EstablecimientoRestController {

    @Autowired
    public RegistrarInformacionEstablecimiento establecimientoRT;

    @PostMapping("/establecimiento")
    public ResponseEntity<?> create(@Valid @RequestBody Establecimiento establecimiento, BindingResult result) {
     
        ObjectMapper objectMapper =new ObjectMapper();
        Establecimiento establecimientoTest = objectMapper.convertValue(establecimiento, Establecimiento.class);
        System.out.println("Modificando /// " + establecimientoTest.toString());
        
        EstablecimientoModel establecimientoModelNew = null;
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
            establecimientoModelNew = establecimientoRT.registrarInfoEstablecimiento(establecimientoTest);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El establecimeinto ha sido creado con éxito!");
        response.put("establecimeinto", establecimientoModelNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @GetMapping("/establecimiento/{nombre}")
    public ResponseEntity<?> BuscarByEmail(@PathVariable String nombre) {

        EstablecimientoModel establecimientoModel = null;
        Map<String, Object> response = new HashMap<>();

        try {
            establecimientoModel = establecimientoRT.BuscarEstablecimientoByName(nombre);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta en la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if (establecimientoModel == null) {
            response.put("mensaje", "El establecimiento ".concat(nombre.toString().concat(" no existe en la base de datos!")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<EstablecimientoModel>(establecimientoModel, HttpStatus.OK);
    }

}
