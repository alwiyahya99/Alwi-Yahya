/*
 * NAMA       : ALWI YAHYA MULJABAR
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117050
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan profile hewan peliharaan
 */
package Rabbit;

public class RABIT {
    public static void main(String[] args) {
        
        Animal nAnimal = new Animal(true, "gress", 4);
        Rabbit nRabbit = new Rabbit("Peter ", nAnimal.isVegetarian(), nAnimal.getEats(), nAnimal.getNoOfLegs(), "grey");
        System.out.println("Hello, His name is " + nRabbit.getName());
        System.out.println(nRabbit.getName() + "is Vegetarian? "+ nRabbit.isVegetarian());
        System.out.println(nRabbit.getName() + "eats " + nRabbit.getEats());
        System.out.println(nRabbit.getName() + "has "+  nRabbit.getNoOfLegs() + " legs");
        System.out.println(nRabbit.getName() + "color is " + nRabbit.getColor());
    }
}
