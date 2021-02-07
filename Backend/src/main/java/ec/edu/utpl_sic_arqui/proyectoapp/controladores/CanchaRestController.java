package ec.edu.utpl_sic_arqui.proyectoapp.controladores;

import ec.edu.utpl_sic_arqui.proyectoapp.adapters.ICanchaAdapter;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.entities.Cancha;
import ec.edu.utpl_sic_arqui.proyectoapp.domain.usecases.AgregarCanchas;
import ec.edu.utpl_sic_arqui.proyectoapp.persistance.models.CanchaModel;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CanchaRestController {
  
    @Autowired
    private AgregarCanchas canchaRT;


    @PostMapping("/cancha")
    public ResponseEntity<?> create(@Valid @RequestBody Cancha cancha, BindingResult result) {
        
        CanchaModel canchaModelNew = null;
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

            canchaModelNew = canchaRT.agregarCancha(cancha);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el insert en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        response.put("mensaje", "La cancha ha sido creado con éxito!");
        response.put("cancha", canchaModelNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }


}
