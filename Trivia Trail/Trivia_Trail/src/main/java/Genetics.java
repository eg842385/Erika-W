package Trivia_Trail.src.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Genetics extends Question{

    public Genetics(String question, String[] choices, String answer) {
        super(question, choices, answer);
    }

    public static List<Genetics> questionSet() {

       ArrayList<Genetics> questionSet = new ArrayList<Genetics>();

        String q = "What is the shape of the DNA molecule?";
        //        this string form can only be used during initialization process
        String[] a = {"Ladder", "Helix", "Double Helix", "Linear Spiral"};
        questionSet.add(new Genetics(q, a, "Double Helix"));

        q = "What are the basic units of heredity in living organisms?";
//        must reuse variable with new String[]
        a = new String[]{"Genes", "Cells", "Chromosomes", "Proteins"};
        questionSet.add(new Genetics(q, a, "Genes"));

        q = "Which of the following bases is NOT found in DNA?";
        a = new String[]{"Cytosine", "Adenine", "Guanine", "Uracil"};
        questionSet.add(new Genetics(q, a, "Uracil"));

        q = "What is the name of the technique used to amplify small amounts of DNA?";
        a = new String[]{"CRISPR", "PCR (Polymerase Chain Reaction)", "Gel electrophoresis", "DNA sequencing"};
        questionSet.add(new Genetics(q, a, "PCR (Polymerase Chain Reaction)"));

        q = "In humans, which genetic condition is associated with an extra copy of chromosome 18?";
        a = new String[]{"Turner syndrome", "Down syndrome", "Edward syndrome", "Klinefelter syndrome"};
        questionSet.add(new Genetics(q, a, "Edward syndrome"));

        q = "Which type of RNA carries the genetic code from DNA to the ribosome?";
        a = new String[]{"tRNA (transfer RNA)", "rRNA (ribosomal RNA)", "mRNA (messenger RNA)", "siRNA (small interfering RNA)"};
        questionSet.add(new Genetics(q, a, "mRNA (messenger RNA)"));

        q = "Which scientist is labeled as the 'Father of Genetics'?";
        a = new String[]{"Gregory Mendel", "James Watson", "Francis Crick", "Charles Darwin"};
        questionSet.add(new Genetics(q, a, "Gregory Mendel"));

        q = "What is the gene frequently associated with breast cancer?";
        a = new String[]{"CHEK2", "tp53", "BRCA", "MUTYH"};
        questionSet.add(new Genetics(q, a, "BRCA"));

//        need to shuffle the question set each time, new Random to indicate it will do it randomly each time
        Collections.shuffle(questionSet, new Random());

        return questionSet;
    }

}
