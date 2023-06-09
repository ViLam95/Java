package minitest.baitap_26_04.service;

public interface Manage<E> {
    E create();

    E update();

    E delete();

    E getById();

    void displayAll();
}
