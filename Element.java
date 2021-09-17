public class Element
{
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Class attributes
    private int m_Tag;
    private Material m_Material;
    private Node m_NodeA;
    private Node m_NodeB;
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Setters
    public void setTag(int Tag)
    {
        m_Tag = Tag; 
    }

    public void setMaterial(Material Material)
    {
        m_Material = Material;
    }

    public void setNodeA(Node NodeA)
    {
        m_NodeA = NodeA;
    }

    public void setNodeB(Node NodeB)
    {
        m_NodeB = NodeB;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Getters
    public int getTag()
    {
        return m_Tag;
    }

    public Material getMaterial()
    {
        return m_Material;
    }

    public Node getNodeA()
    {
        return m_NodeA;
    }

    public Node getNodeB()
    {
        return m_NodeB;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

}