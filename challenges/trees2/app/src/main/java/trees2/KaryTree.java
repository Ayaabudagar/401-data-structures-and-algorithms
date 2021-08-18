package trees2;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T>{
    Knode<T> root;
    int K;


    public KaryTree(int maxChildrenNum) {
        if(maxChildrenNum <= 1){
            maxChildrenNum = 2;
        }
        this.K = maxChildrenNum;
    }



    public void add(T value){
        Knode<T> newNode = new Knode<>(value);
        if(this.root == null){
            this.root = newNode;
            return;
        }

        Queue<Knode<T>> queueNodes = new LinkedList<>();
        queueNodes.add(root);
        while(!queueNodes.isEmpty()){
            Knode<T> current = queueNodes.poll();
            if(current.allChildren.size() < this.K){
                current.addChild(newNode);
                return;
            }
            else {
                queueNodes.addAll(current.allChildren);
            }
        }
    }



}
