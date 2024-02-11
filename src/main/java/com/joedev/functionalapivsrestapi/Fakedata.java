package com.joedev.functionalapivsrestapi;

import reactor.core.publisher.Flux;

public class Fakedata {

    private Fakedata() {}
    public static Flux<User> listUsers() {
        return Flux.just(
                new User(1L, "Alice Smith", "+509-5456-7890"),
                new User(2L, "Bob Johnson", "+57-209-6744-7890"),
                new User(3L, "Caroline Williams", "+1-243-456-7890"),
                new User(4L, "David Brown", "+9676-056-7890"),
                new User(5L, "Elena Garcia", "+8976-0456-7890"),
                new User(6L, "Frank Martinez", "+1232-456-7890"),
                new User(7L, "Gina Taylor", "+987-2654-3210"),
                new User(8L, "Henry Rodriguez", "+9387-123-4567"),
                new User(9L, "Isabel Lopez", "+1-2342-567-8901"),
                new User(10L, "Kevin Perez", "+44-1233-456-7890"),
                new User(11L, "Laura Hernandez", "+1-2334-567-8901"),
                new User(12L, "Michael Gonzalez", "+44-123-0456-7890"),
                new User(13L, "Natalie Ramirez", "+5089-456-7890"),
                new User(14L, "Oscar Torres", "+57-3093-6744-7890"),
                new User(15L, "Paula Flores", "+9934-343-456-7890"),
                new User(16L, "Quinn Carter", "+96-456-7890"),
                new User(17L, "Ryan King", "+8976-44456-7890"),
                new User(18L, "Samantha White", "+1233-456-7890"),
                new User(19L, "Thomas Lee", "+987-654-003210"),
                new User(20L, "Ursula Martinez", "+987-10023-4567"),
                new User(21L, "Victor Scott", "+1-2314-5067-8901"),
                new User(22L, "Wendy Hill", "+44-1023-456-7890"),
                new User(23L, "Xavier Green", "+50932-456-7890"),
                new User(24L, "Yvonne Adams", "+57-30329-6744-7890"),
                new User(25L, "Zoe Baker", "+1-343-45326-7890"),
                new User(26L, "Andrew Wright", "+9676-45336-7890"),
                new User(27L, "Barbara Campbell", "+8976-4456-7890"),
                new User(28L, "Charles Mitchell", "+123-45096-7890"),
                new User(29L, "Diana Perez", "+987-654-3297810"),
                new User(30L, "Edward Sanchez", "+987-123-9844567"),
                new User(31L, "Fiona Nelson", "+1-234-567-8901"),
                new User(32L, "George Turner", "+44-123-456-7890"),
                new User(33L, "Hannah Cooper", "+509-456-7890"),
                new User(34L, "Ian Stewart", "+57-309-6744-7890"),
                new User(35L, "Julia Rivera", "+1-343-456-7890"),
                new User(36L, "Kyle Ward", "+9676-456-7890"),
                new User(37L, "Linda Murphy", "+8976-456-7890"),
                new User(38L, "Michaela Gray", "+123-456-7890"),
                new User(39L, "Nathan Bell", "+987-654-3210"),
                new User(40L, "Olivia Cox", "+987-123-4567"),
                new User(41L, "Patrick Adams", "+1-234-567-8901"),
                new User(42L, "Rachel Parker", "+44-123-456-7890"),
                new User(43L, "Simon Cook", "+509-456-7890"),
                new User(44L, "Tina Evans", "+57-309-6744-7890"),
                new User(45L, "Ulysses Diaz", "+1-343-456-7890"),
                new User(46L, "Valerie Hughes", "+9676-456-7890"),
                new User(47L, "William Gray", "+8976-456-7890"),
                new User(48L, "Xander Foster", "+123-456-7890"),
                new User(49L, "Yasmine Patel", "+987-654-3210"),
                new User(50L, "Zackary Johnson", "+987-123-4567")
        );
    }

}
