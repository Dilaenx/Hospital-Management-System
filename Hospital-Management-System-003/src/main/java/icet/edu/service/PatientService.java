package icet.edu.service;

import icet.edu.dto.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getPatient();
    void addPatient(Patient patient);
}
