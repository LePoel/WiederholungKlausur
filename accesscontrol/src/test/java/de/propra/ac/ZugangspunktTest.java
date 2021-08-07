package de.propra.ac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.propra.ac.network.Netzwerk;
import de.propra.ac.scanner.PersonCategory;
import de.propra.ac.scanner.Scanner;

import static org.mockito.Mockito.mock;

public class ZugangspunktTest {
    @Test
    @DisplayName("Eine Angestellte will mit einem 10 Minuten alten Test den Bereich betreten und wird vom System eingelassen.")
    void test1(){
        //Arrange
        Netzwerk net = mock(Netzwerk.class);
        Scanner scanner = mock(Scanner.class);
        Zugangspunkt zugangspunkt = new Zugangspunkt(10, 2, 0 , net, scanner);

    }
}
