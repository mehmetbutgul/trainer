package org.example;

public class MyArrayList implements MyList {
    public String[] words;
    private int index=0;
    private int factor=10;
    private int initiliazedSize;
    public MyArrayList(){
        this(10);
    }
    public MyArrayList(int initiliazedSize){
        this(initiliazedSize,10);
    }
    public MyArrayList(int initiliazedSize, int factor){
        words=new String[initiliazedSize];
        this.initiliazedSize=initiliazedSize;
        this.factor=factor;
    }
    @Override
    public void add(String str) {
        if(index== words.length){
            enlargeArray();
        }
        this.words[index]=str;
        index++;
    }
    private void enlargeArray(){
        String[] newArray= new String[words.length+factor];
         for(int i=0; i<words.length;i++){
         newArray[i]=words[i];
        }
         words=newArray;
    }

    @Override
    public boolean isEmpty() {
        return this.index==0;
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }


    @Override
    public boolean remove(String o) {
        return false;
    }

    @Override
    public void clear() {
        this.words=new String[initiliazedSize];
        this.index=0;
    }

    @Override
    public String get(int index) {
        if(index>=this.index) throw new ArrayIndexOutOfBoundsException();
        return words[index];
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(String o) {
        return 0;
    }

}
