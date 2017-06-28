package mom.trd.opentheso.bdd.helper.nodes.concept;

import java.util.ArrayList;
import mom.trd.opentheso.bdd.datas.Concept;
import mom.trd.opentheso.bdd.helper.nodes.NodeAlignment;
import mom.trd.opentheso.bdd.helper.nodes.NodeEM;
import mom.trd.opentheso.bdd.helper.nodes.NodeGps;
import mom.trd.opentheso.bdd.helper.nodes.NodeHieraRelation;
import mom.trd.opentheso.bdd.helper.nodes.NodeUri;
import mom.trd.opentheso.bdd.helper.nodes.notes.NodeNote;
import mom.trd.opentheso.bdd.helper.nodes.term.NodeTermTraduction;

public class NodeConceptExport {

    

    //pour gérer le concept
    private Concept concept;
    
    //BT termes génériques
    private ArrayList <NodeHieraRelation> nodeListOfBT;

    //NT pour les termes spécifiques
    private ArrayList <NodeHieraRelation> nodeListOfNT;

    //RT related term
    private ArrayList <NodeHieraRelation> nodeListIdsOfRT;

    //EM ou USE synonymes ou employé pour
    private ArrayList<NodeEM> nodeEM;

    //pour la liste des domaines du Concept
    private ArrayList<NodeUri> nodeListIdsOfConceptGroup;
    
    //les traductions ddu Term
    private ArrayList <NodeTermTraduction> nodeTermTraductions;
    
    private ArrayList <NodeNote> nodeNoteTerm;
    
    private ArrayList <NodeNote> nodeNoteConcept;
    
    private ArrayList <NodeAlignment> nodeAlignmentsList;

    private NodeGps nodeGps;

    public NodeConceptExport() {
    }



    public Concept getConcept() {
        return concept;
    }

    public void setConcept(Concept concept) {
        this.concept = concept;
    }


    public ArrayList<NodeHieraRelation> getNodeListIdsOfRT() {
        return nodeListIdsOfRT;
    }

    public void setNodeListIdsOfRT(ArrayList<NodeHieraRelation> nodeListIdsOfRT) {
        this.nodeListIdsOfRT = nodeListIdsOfRT;
    }

    public ArrayList<NodeEM> getNodeEM() {
        return nodeEM;
    }

    public void setNodeEM(ArrayList<NodeEM> nodeEM) {
        this.nodeEM = nodeEM;
    }

    public ArrayList<NodeUri> getNodeListIdsOfConceptGroup() {
        return nodeListIdsOfConceptGroup;
    }

    public void setNodeListIdsOfConceptGroup(ArrayList<NodeUri> nodeListIdsOfConceptGroup) {
        this.nodeListIdsOfConceptGroup = nodeListIdsOfConceptGroup;
    }

    public ArrayList<NodeTermTraduction> getNodeTermTraductions() {
        return nodeTermTraductions;
    }

    public void setNodeTermTraductions(ArrayList<NodeTermTraduction> nodeTermTraductions) {
        this.nodeTermTraductions = nodeTermTraductions;
    }

    public ArrayList<NodeNote> getNodeNoteTerm() {
        return nodeNoteTerm;
    }

    public void setNodeNoteTerm(ArrayList<NodeNote> nodeNoteTerm) {
        this.nodeNoteTerm = nodeNoteTerm;
    }

    public ArrayList<NodeNote> getNodeNoteConcept() {
        return nodeNoteConcept;
    }

    public void setNodeNoteConcept(ArrayList<NodeNote> nodeNoteConcept) {
        this.nodeNoteConcept = nodeNoteConcept;
    }

    public ArrayList<NodeAlignment> getNodeAlignmentsList() {
        return nodeAlignmentsList;
    }

    public void setNodeAlignmentsList(ArrayList<NodeAlignment> nodeAlignmentsList) {
        this.nodeAlignmentsList = nodeAlignmentsList;
    }

    public NodeGps getNodeGps() {
        return nodeGps;
    }

    public void setNodeGps(NodeGps nodeGps) {
        this.nodeGps = nodeGps;
    }

    public ArrayList<NodeHieraRelation> getNodeListOfBT() {
        return nodeListOfBT;
    }

    public void setNodeListOfBT(ArrayList<NodeHieraRelation> nodeListOfBT) {
        this.nodeListOfBT = nodeListOfBT;
    }

    public ArrayList<NodeHieraRelation> getNodeListOfNT() {
        return nodeListOfNT;
    }

    public void setNodeListOfNT(ArrayList<NodeHieraRelation> nodeListOfNT) {
        this.nodeListOfNT = nodeListOfNT;
    }

    
    
    

   

    
    
}
