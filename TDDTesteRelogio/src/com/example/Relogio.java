package com.example;

public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public void programarHoras(int horas) {
        this.horas = horas;
    }

    public void reiniciarMeiaNoite() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

   
    
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
