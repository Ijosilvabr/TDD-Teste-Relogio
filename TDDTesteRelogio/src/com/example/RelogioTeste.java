package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class RelogioTeste {

    @Test
    public void testProgramarHoras() {
        Relogio relogio = new Relogio();
        relogio.programarHoras(10);
        assertEquals(10, relogio.getHoras());
    }

    @Test
    public void testReiniciarMeiaNoite() {
        Relogio relogio = new Relogio();
        relogio.reiniciarMeiaNoite();
        assertEquals(0, relogio.getHoras());
        assertEquals(0, relogio.getMinutos());
        assertEquals(0, relogio.getSegundos());
    }

   
}

