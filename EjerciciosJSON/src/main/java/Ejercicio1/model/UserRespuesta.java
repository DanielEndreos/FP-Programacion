package Ejercicio1.model;

// UserRespuesta.java

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class UserRespuesta {
    private List<Result> results;
    private Info info;

    public void mostrarDatos(){
        System.out.println("Nombre: "+results.get(0).getName().getTitle() +
                           " "+ results.get(0).getName().getFirst() +
                           " "+results.get(0).getName().getLast()
                            );
        System.out.println("Email: "+ results.get(0).getEmail());
        System.out.println("Pais: "+results.get(0).getLocation().getCountry());
    }
}

// Info.java

@Data
class Info {
    private String seed;
    private long results;
    private long page;
    private String version;
}

// Result.java

@Data
class Result {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Dob dob;
    private Dob registered;
    private String phone;
    private String cell;
    private ID id;
    private Picture picture;
    private String nat;
}

// Dob.java

@Data
class Dob {
    private OffsetDateTime date;
    private long age;
}

// ID.java


@Data
class ID {
    private String name;
    private String value;
}

// Location.java

@Data
class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordinates coordinates;
    private Timezone timezone;
}

// Coordinates.java

@Data
class Coordinates {
    private String latitude;
    private String longitude;
}

// Street.java

@Data
class Street {
    private long number;
    private String name;
}

// Timezone.java

@Data
class Timezone {
    private String offset;
    private String description;
}

// Login.java

@Data
class Login {
    private UUID uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}

// Name.java

@Data
class Name {
    private String title;
    private String first;
    private String last;
}

// Picture.java

@Data
class Picture {
    private String large;
    private String medium;
    private String thumbnail;
}
