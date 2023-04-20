package miniTest.list.controller;

import miniTest.list.model.Person;

interface Manage {
    void displayAll();
    void addPerson(Person person);
    int indexOfPerson (int id);
    int removePerson(int id);
    void updatePerson();
    void sortListByAverage();
    double calculateTotalScore();
}
