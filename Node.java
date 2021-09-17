public class Node
{
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Class attributes
    private int m_Tag;
    private double m_xCoordinate;
    private double m_yCoordinate;
    private double m_zCoordinate;
    private double m_xDOF;
    private double m_yDOF;
    private double m_rxDOF;
    private double m_ryDOF;
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Setters
    public void setTag(int Tag)
    {
        m_Tag = Tag;
    }

    public void setCoordinates(double xCoordinate, double yCoordinate, double zCoordinate)
    {
        m_xCoordinate = xCoordinate;
        m_yCoordinate = yCoordinate;
        m_zCoordinate = zCoordinate;
    }

    public void setDOF(double xDOF, double yDOF, double rxDOF, double ryDOF)
    {
        m_xDOF = xDOF;
        m_yDOF = yDOF;
        m_rxDOF = rxDOF;
        m_ryDOF = ryDOF;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Getters
    public int getTag()
    {
        return m_Tag;
    }

    public double[] getCoordinates()
    {
        double nodalCoordinates = new double[3];
        nodalCoordinates[0] = m_xCoordinate;
        nodalCoordinates[1] = m_yCoordinate;
        nodalCoordinates[2] = m_zCoordinate
        return nodalCoordinates;
    }

    public double[] getDOF()
    {
        double nodalDOF = new double[4];
        nodalDOF[0] = m_xDOF;
        nodalDOF[1] = m_yDOF;
        nodalDOF[2] = m_rxDOF;
        nodalDOF[3] = m_ryDOF;
        return nodalDOF;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -







}
