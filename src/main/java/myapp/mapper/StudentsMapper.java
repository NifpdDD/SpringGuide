package myapp.mapper;

import myapp.dto.StudentsDto;
import myapp.model.Students;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface StudentsMapper {
  Students toEntity(StudentsDto studentsDto);

  StudentsDto toDto(Students students);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  Students partialUpdate(StudentsDto studentsDto, @MappingTarget Students students);
}