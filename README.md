# SpringBootExceptionHandler
simple exception handler example for 3 different exceptions

when the app runs, car objects are filled in the static list (in the carService.class) with init() method.


endpoints with parameters without exceptions;

    localhost:8080/car?brand=mercedes
    localhost:8080/car?brand=audi
    localhost:8080/car?brand=bmw


endpoints with exceptions;

    localhost:8080/car   ->  Exception -> "something is wrong try again later!!"
    localhost:8080/car?brand=1test  -> IllegalArgumentException -> "wrong argument!!"
    localhost:8080/car?brand=test   -> CarNotFoundException -> "car not found!!"
