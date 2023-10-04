
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import mapper.CarMapper;
import obj.mine.Car;
import obj.mine.CarDto;
import obj.mine.Person;
import obj.mine.PersonDto;

public class CarMapperTest {

  private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);

  @Test
  public void testCarToCarDtoMapping() {
    // Given
    Car car = new Car();
    car.setMake("Toyota");
    car.setNumberOfSeats(4);

    // When
    CarDto carDto = carMapper.carToCarDto(car);

    // Then
    assertEquals("Toyota", carDto.getManufacturer());
    assertEquals(4, carDto.getSeatCount());
  }

  @Test
  public void testPersonToPersonDtoMapping() {
    // Given
    Person person = new Person();
    person.setName("John Doe");

    // When
    PersonDto personDto = carMapper.personToPersonDto(person);

    // Then
    assertEquals("John Doe", personDto.getFullName());
  }
}
