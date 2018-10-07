package examTreasure.javaCore.S4_2Obj;

public class T4_1_8 extends Father{

    public T4_1_8(int age) {
        // 如果父类不能提供无参构造函数，则必须显式调用父类构造函数
        super(age);
    }
}
class Father
{
    public Father(int age)
    {}
}