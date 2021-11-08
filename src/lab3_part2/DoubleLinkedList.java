package lab3_part2;  

public class DoubleLinkedList {
    private Element firstElement;
    private Element lastElement;

    private class Element {
        private int data;
        private Element parent;
        private Element child;
    }

    public void addListFirst(DoubleLinkedList list) {
        if (list != null && list.firstElement !=null) {
            if (firstElement != null) {
                list.lastElement.child = firstElement;
                firstElement.parent = list.lastElement;
                firstElement=list.firstElement;
            }
            else {
                firstElement = list.firstElement;
                lastElement = list.lastElement;
            }
        }
    }


    public void addListLast(DoubleLinkedList list) {
        if (list != null && list.lastElement !=null) {
            if (lastElement != null) {
                lastElement.child=list.firstElement;
                list.firstElement.parent=lastElement;
                lastElement=list.lastElement;
            }
            else {
                firstElement = list.firstElement;
                lastElement = list.lastElement;
            }
        }
    }



    public void addArrayLast(int[] array) {
        if (array != null && array.length != 0) {
            if (lastElement != null) {
                for (int i = 0; i < array.length; i++) {
                    Element newElement = new Element();
                    newElement.data = array[i];
                    newElement.parent = lastElement;
                    lastElement.child = newElement;
                    lastElement = newElement;
                }
            }
            else {
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        lastElement = new Element();
                        firstElement = lastElement;
                        lastElement.data = array[i];
                    }
                    else {
                        Element newElement = new Element();
                        newElement.data = array[i];
                        newElement.parent = lastElement;
                        lastElement.child = newElement;
                        lastElement = newElement;
                    }
                }
            }
        }
    }

    public void addArrayFirst(int[] array) {
        if (array != null && array.length != 0) {
            if (firstElement != null) {
                for (int i = 0; i < array.length; i++) {
                    Element newElement = new Element();
                    newElement.data = array[i];
                    newElement.child = firstElement;
                    firstElement.parent = newElement;
                    firstElement = newElement;
                }
            }
            else {
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        firstElement = new Element();
                        lastElement = firstElement;
                        firstElement.data = array[i];
                    }
                    else {
                        Element newElement = new Element();
                        newElement.data = array[i];
                        newElement.child = firstElement;
                        firstElement.parent = newElement;
                        firstElement = newElement;
                    }
                }
            }
        }
    }

    public String printFromStart() {
        if (firstElement != null) {
            String line = "";
            Element tempElement = firstElement;
            while (tempElement != null) {
                line = line + " " + tempElement.data;
                tempElement = tempElement.child;
            }
            return line;
        }
        else return "Коллекция пуста";
    }

    public String printFromEnd() {
        if (lastElement != null) {
            String line = "";
            Element tempElement = lastElement;
            while (tempElement != null) {
                line = line + " " + tempElement.data;
                tempElement = tempElement.parent;
            }
            return line;
        }
        else {
            return "Коллекция пуста";
        }
    }
}
