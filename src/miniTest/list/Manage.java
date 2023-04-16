package miniTest.list;

    interface Manage {
    void displayAll();
    void addPerson(Person person);
    int indexOfPerson (int id);
    int removePerson(int id);
    void updatePerson();
    void sortListByAverage();
    public double calculateTotalScore();
}
