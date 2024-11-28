package icet.edu.service;

import icet.edu.dto.Patient;
import icet.edu.entity.PatientEntity;
import icet.edu.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{

    final PatientRepository repository;
    final ModelMapper mapper;



    @Override
    public List<Patient> getPatient() {
        List<Patient> patients = new ArrayList<>();
        repository.findAll().forEach(patient-> patients.add(mapper.map(patient, Patient.class)));

        return patients;
    }

    @Override
    public void addPatient(Patient patient) {

        repository.save(mapper.map(patient, PatientEntity.class));
    }
}
