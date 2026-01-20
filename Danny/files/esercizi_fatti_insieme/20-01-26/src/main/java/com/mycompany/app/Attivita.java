package com.mycompany.app;

import java.time.LocalDateTime;

/**
 * Attivita
 */
public class Attivita {

  private String nome;
  private int capacitaMassima;
  private LocalDateTime startTime;
  private LocalDateTime endTime;

  public Attivita(String nome, int capacitaMassima, LocalDateTime startTime, LocalDateTime endTime) {
    this.nome = nome;
    this.capacitaMassima = capacitaMassima;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCapacitaMassima() {
    return capacitaMassima;
  }

  public void setCapacitaMassima(int capacitaMassima) {
    this.capacitaMassima = capacitaMassima;
  }

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDateTime endTime) {
    this.endTime = endTime;
  }

  @Override
  public String toString() {
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    return nome + "," + capacitaMassima + "," + startTime.format(formatter) + "," + endTime.format(formatter);
  }

}
