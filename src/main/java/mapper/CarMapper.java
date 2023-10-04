package mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import obj.mine.Car;
import obj.mine.CarDto;
import obj.mine.Person;
import obj.mine.PersonDto;

@Mapper
public interface CarMapper {

  CarMapper MAPPER = Mappers.getMapper(CarMapper.class);

  @Mapping(target = "manufacturer", source = "make")
  @Mapping(target = "seatCount", source = "numberOfSeats")
  CarDto carToCarDto(Car car);

  @Mapping(target = "fullName", source = "name")
  PersonDto personToPersonDto(Person person);
}
