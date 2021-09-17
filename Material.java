public class Material
{
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Class attributes
    private int m_Tag;
    private double m_rho;
    private double m_Emodulus;
    private double m_nu;
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Setters
    public void setTag(int Tag)
    {
        m_Tag = Tag;
    }
        
    public void setRho(double rho)
    {
        m_rho = rho;
    }
        
    public void setModulus(double Emodulus)
    {
        m_Emodulus = Emodulus;
    }
        
    public void setNu(double nu)
    {
        m_nu = nu;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

    // - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // Getters
    public int getTag()
    {
        return m_Tag;
    }

    public int getRho()
    {
        return m_rho;
    }

    public int getModulus()
    {
        return m_Emodulus;
    }

    public int getNu()
    {
        return m_nu;
    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - -

}