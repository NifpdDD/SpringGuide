package myapp.service;

import java.util.List;
import java.util.Optional;
import myapp.dto.FacultiesDto;
import myapp.mapper.FacultiesMapper;
import myapp.model.Faculties;
import myapp.repository.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultiesService {

    private final FacultiesRepository facultiesRepository;
    private final FacultiesMapper facultiesMapper;

    @Autowired
    public FacultiesService(FacultiesRepository facultiesRepository, FacultiesMapper facultiesMapper) {
        this.facultiesRepository = facultiesRepository;
        this.facultiesMapper = facultiesMapper;
    }

    public List<Faculties> getAllFaculties() {
        return facultiesRepository.findAll();
    }

    public Optional<Faculties> getFacultiesById(Long id) {
        return facultiesRepository.findById(id);
    }

    public void addFaculties(FacultiesDto faculties) {
        facultiesRepository.save(facultiesMapper.toEntity(faculties));
    }

    public void updateFaculties(FacultiesDto faculties) {
        facultiesRepository.save(facultiesMapper.toEntity(faculties));
    }

    public void deleteFaculties(Long id) {
        if (facultiesRepository.existsById(id)) {
            facultiesRepository.deleteById(id);
        } else {
            // Handle the case where the faculty with the given id doesn't exist
            throw new IllegalArgumentException("Faculty with ID " + id + " not found");
        }
    }
}
