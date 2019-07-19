/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AEnquantoComando extends PComando
{
    private TEnquanto _enquanto_;
    private TAbreParenteses _abreParenteses_;
    private PExpLogica _expLogica_;
    private TFechaParenteses _fechaParenteses_;
    private TFaca _faca_;
    private PCmdSequence _cmdSequence_;
    private TFimEnquanto _fimEnquanto_;
    private TPontoVirgula _pontoVirgula_;

    public AEnquantoComando()
    {
        // Constructor
    }

    public AEnquantoComando(
        @SuppressWarnings("hiding") TEnquanto _enquanto_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PCmdSequence _cmdSequence_,
        @SuppressWarnings("hiding") TFimEnquanto _fimEnquanto_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setEnquanto(_enquanto_);

        setAbreParenteses(_abreParenteses_);

        setExpLogica(_expLogica_);

        setFechaParenteses(_fechaParenteses_);

        setFaca(_faca_);

        setCmdSequence(_cmdSequence_);

        setFimEnquanto(_fimEnquanto_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEnquantoComando(
            cloneNode(this._enquanto_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._expLogica_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._faca_),
            cloneNode(this._cmdSequence_),
            cloneNode(this._fimEnquanto_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEnquantoComando(this);
    }

    public TEnquanto getEnquanto()
    {
        return this._enquanto_;
    }

    public void setEnquanto(TEnquanto node)
    {
        if(this._enquanto_ != null)
        {
            this._enquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._enquanto_ = node;
    }

    public TAbreParenteses getAbreParenteses()
    {
        return this._abreParenteses_;
    }

    public void setAbreParenteses(TAbreParenteses node)
    {
        if(this._abreParenteses_ != null)
        {
            this._abreParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreParenteses_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TFechaParenteses getFechaParenteses()
    {
        return this._fechaParenteses_;
    }

    public void setFechaParenteses(TFechaParenteses node)
    {
        if(this._fechaParenteses_ != null)
        {
            this._fechaParenteses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaParenteses_ = node;
    }

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
    }

    public PCmdSequence getCmdSequence()
    {
        return this._cmdSequence_;
    }

    public void setCmdSequence(PCmdSequence node)
    {
        if(this._cmdSequence_ != null)
        {
            this._cmdSequence_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmdSequence_ = node;
    }

    public TFimEnquanto getFimEnquanto()
    {
        return this._fimEnquanto_;
    }

    public void setFimEnquanto(TFimEnquanto node)
    {
        if(this._fimEnquanto_ != null)
        {
            this._fimEnquanto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimEnquanto_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._enquanto_)
            + toString(this._abreParenteses_)
            + toString(this._expLogica_)
            + toString(this._fechaParenteses_)
            + toString(this._faca_)
            + toString(this._cmdSequence_)
            + toString(this._fimEnquanto_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._enquanto_ == child)
        {
            this._enquanto_ = null;
            return;
        }

        if(this._abreParenteses_ == child)
        {
            this._abreParenteses_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._fechaParenteses_ == child)
        {
            this._fechaParenteses_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._cmdSequence_ == child)
        {
            this._cmdSequence_ = null;
            return;
        }

        if(this._fimEnquanto_ == child)
        {
            this._fimEnquanto_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._enquanto_ == oldChild)
        {
            setEnquanto((TEnquanto) newChild);
            return;
        }

        if(this._abreParenteses_ == oldChild)
        {
            setAbreParenteses((TAbreParenteses) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._fechaParenteses_ == oldChild)
        {
            setFechaParenteses((TFechaParenteses) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._cmdSequence_ == oldChild)
        {
            setCmdSequence((PCmdSequence) newChild);
            return;
        }

        if(this._fimEnquanto_ == oldChild)
        {
            setFimEnquanto((TFimEnquanto) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}