package com.company;
/*Animal деген класс тузунуз жана бир метод кошунуз.
Анын 3 наследнигин тузунуз.

Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
кошунуз.
instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
чыгарыныз.
Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
болуп оз озунун массивине салыныз*/
public class Animal {
    public Animal() {
    }

     public void eat(){
    System.out.println("Animals" );
}

    @Override
    public String toString() {
        return "Animal{animals}";
    }
}
