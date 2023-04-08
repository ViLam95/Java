package demo;

import java.util.stream.IntStream;

public class CheckSaraly {
    public static void main(String[] args) {
        FullTime employeds = new FullTime("1","Lam",29,5);
        FullTime employeds1 = new FullTime("2","Hieu",29,4);
        PartTime employeds2= new PartTime("3","Dung",29,3);
        PartTime employeds3 = new PartTime("4","Minh",29,5);
        Employed [] employed = {employeds,employeds1,employeds2,employeds3};
        IntStream.range(0, employed.length).forEach(i -> {
            if (employed[i] instanceof FullTime) {
                (((FullTime) employed[i]).salary) = ((FullTime) employed[i]).getSalary();
                System.out.println(employed[i]);
            } else if (employed[i] instanceof PartTime) {
                (((PartTime) employed[i]).salary) = ((PartTime) employed[i]).getSalary();
                System.out.println(employed[i]);
            }
        });
    }

}
