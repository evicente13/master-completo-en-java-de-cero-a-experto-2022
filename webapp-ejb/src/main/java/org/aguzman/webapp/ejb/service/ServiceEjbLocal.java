package org.aguzman.webapp.ejb.service;

import jakarta.ejb.Local;

@Local
public interface ServiceEjbLocal {
    String saludar(String nombre);

}
