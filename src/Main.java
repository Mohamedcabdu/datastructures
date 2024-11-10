public class Main {


        public static void main(String[] args) {
            ArrayStack<Integer> list1 = new ArrayStack<>(4);
            list1.push(90);
            list1.push(79);
            list1.push(60);
            list1.push(78);
            ArrayStack<Integer> list2 = new ArrayStack<>(4);
            list2.push(79);
            list2.push(60);
            list2.push(34);
            list2.push(78);
//
            ArrayStack<Integer> list3 = new ArrayStack<>(4);


            list3.merge(list1,list2);


            list3.display();

        }

    }
