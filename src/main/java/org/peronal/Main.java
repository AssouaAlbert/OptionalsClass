package org.peronal;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> person = Optional.of("personDao.selectPersonById(uuid)");
        String p = person.orElse(null);
        System.out.println("====================");
        System.out.println(p.getClass());
    }
}