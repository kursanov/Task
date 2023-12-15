package kursanov.kg.linkedList.id;

public class GeneratedId {

    public static int actorId = 0;

    public static int movieId = 0;
    public static int producerId = 0;




    public static  int idGeneratorForActor(){
        return ++actorId;
    }
    public static  int idGeneratorForMovie(){
        return (++movieId);
    }
    public static  int idGeneratorForProducer(){
        return ++producerId;
    }

}
