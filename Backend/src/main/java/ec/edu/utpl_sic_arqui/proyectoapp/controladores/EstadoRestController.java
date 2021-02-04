package ec.edu.utpl_sic_arqui.proyectoapp.controladores;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.IEstadoAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.EstadoModel;

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


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstadoRestController {
    @Autowired
    private IEstadoAdapter iEstadoAdapter;

    @GetMapping("/estado")
    public List<EstadoModel> listarEstados() {
        return iEstadoAdapter.findAll();
    }

    @PostMapping("/estado")
    public ResponseEntity<?> create(@Valid @RequestBody EstadoModel estado, BindingResult result) {

        EstadoModel estadoModelNew = null;
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
            estadoModelNew = iEstadoAdapter.save(estado);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "El estado ha sido creado con éxito!");
        response.put("estado", estadoModelNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
//    public EstadoModel listar() {
//        return null;
//    }
//
//    public String crear(EstadoModel estado) {
//        return null;
//    }
//
//    public String actualizar(int id, EstadoModel estado) {
//        return null;
//    }
//
//    public String delete(int id) {
//        return null;
//    }

}
