package calc.rest;

public interface Operation {

 long apply(long a, long b);

 boolean valid(char operator);

}