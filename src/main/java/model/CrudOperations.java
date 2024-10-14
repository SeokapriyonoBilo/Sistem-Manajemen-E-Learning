/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Slimbook 14 R5
 */
public interface CrudOperations {
    void create(T t);
    T read(String id);
    void update(T t);
    void delete(String id);

    public static class T {

        public T() {
        }
    }
}
