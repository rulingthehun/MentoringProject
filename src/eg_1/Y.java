package eg_1;

public class Y extends X{

    @Override
    int methodX(int i) {
        return ++i + i++;
    }
}
