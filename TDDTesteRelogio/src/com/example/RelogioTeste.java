package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RelogioTeste {
	public void testCriacaoRelogio() {
        Relogio relogio = new Relogio();
        assertNotNull(relogio);
    }

}
