package mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import obj.official.Source;
import obj.official.Target;

@Mapper
public interface SourceTargetMapper {

  SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

  @Mapping(source = "qax", target = "baz")
  @Mapping(source = "baz", target = "qax")
  Target sourceToTarget(Source source);

  @InheritInverseConfiguration
  Source targetToSource(Target target);
}
