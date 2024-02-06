package myapp.mapper;

import org.mapstruct.*;
import myapp.dto.FacultiesDto;
import myapp.model.Faculties;
import org.springframework.stereotype.Component;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface FacultiesMapper {
  Faculties toEntity(FacultiesDto facultiesDto);

  FacultiesDto toDto(Faculties faculties);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  Faculties partialUpdate(FacultiesDto facultiesDto, @MappingTarget Faculties faculties);
}