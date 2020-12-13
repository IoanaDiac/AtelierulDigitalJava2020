package lab3.hardCodeChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Decoration implements DecorableTree {
    private int position;
    private String decoration;
    private DecorableTree christmasTree;

    public Decoration(int position, String decoration,DecorableTree christmasTree) {
        this.position = position;
        this.decoration = decoration;
        this.christmasTree = christmasTree;
    }

    public List<List<String>> getTree() {
        List<List<String>> originalTree = christmasTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalTree);
        List<String> originalTwig = decoratedTree.get(position);
        List<String> decoratedTwig = new ArrayList<>(originalTwig);

        int left = originalTwig.indexOf("<");
        int right = originalTwig.indexOf(">");

        for (int i = left + 1; i < right; i++) {
            decoratedTwig.set(i, decoration);
        }

        decoratedTree.set(position, decoratedTwig);
        return decoratedTree;
    }

    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }
    }
}
