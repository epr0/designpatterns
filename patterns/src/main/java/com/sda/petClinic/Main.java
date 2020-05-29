package com.sda.petClinic;

public class Main {

    public static void main(String[] args) {
        Person personAna = new Person();
        personAna.setFirstname("Ana");
        personAna.setLastname("AnaLast");

        Person personIon = new Person();
        personIon.setFirstname("Ion");
        personIon.setLastname("IonLast");

        Pet pet1 = new Pet();
        pet1.setVaccinated(true);
        pet1.setOwner(personAna);

        Dog dogLabrador = new Dog();
        dogLabrador.setBreed("Labrador");
        dogLabrador.setVaccinated(true);
        dogLabrador.setOwner(personIon);

        Dog dogBuldog = new Dog();
        dogBuldog.setBreed("Buldog");
        dogBuldog.setVaccinated(false);
        dogBuldog.setOwner(personIon);

        Fish fishPastrav = new Fish();
        fishPastrav.setCanLiveInAquarium(false);

        Fish fishSomon = new Fish();
        fishSomon.setCanLiveInAquarium(false);

//        personAna.getPetList().add(fishPastrav);
//        personAna.getPetList().add(fishSomon);
        personAna.addPet(fishPastrav);
        personAna.addPet(fishSomon);




        System.out.println(dogBuldog.getOwnerName());
    }
}
