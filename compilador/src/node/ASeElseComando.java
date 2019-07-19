/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASeElseComando extends PComando
{
    private TSe _se_;
    private TAbreParenteses _abreParenteses_;
    private PExpLogica _expLogica_;
    private TFechaParenteses _fechaParenteses_;
    private TEntao _entao_;
    private PCmdSequence _cmdSequence_;
    private PIfElse _ifElse_;
    private TFimSe _fimSe_;
    private TPontoVirgula _pontoVirgula_;

    public ASeElseComando()
    {
        // Constructor
    }

    public ASeElseComando(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TAbreParenteses _abreParenteses_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TFechaParenteses _fechaParenteses_,
        @SuppressWarnings("hiding") TEntao _entao_,
        @SuppressWarnings("hiding") PCmdSequence _cmdSequence_,
        @SuppressWarnings("hiding") PIfElse _ifElse_,
        @SuppressWarnings("hiding") TFimSe _fimSe_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setSe(_se_);

        setAbreParenteses(_abreParenteses_);

        setExpLogica(_expLogica_);

        setFechaParenteses(_fechaParenteses_);

        setEntao(_entao_);

        setCmdSequence(_cmdSequence_);

        setIfElse(_ifElse_);

        setFimSe(_fimSe_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ASeElseComando(
            cloneNode(this._se_),
            cloneNode(this._abreParenteses_),
            cloneNode(this._expLogica_),
            cloneNode(this._fechaParenteses_),
            cloneNode(this._entao_),
            cloneNode(this._cmdSequence_),
            cloneNode(this._ifElse_),
            cloneNode(this._fimSe_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeElseComando(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
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

    public TEntao getEntao()
    {
        return this._entao_;
    }

    public void setEntao(TEntao node)
    {
        if(this._entao_ != null)
        {
            this._entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entao_ = node;
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

    public PIfElse getIfElse()
    {
        return this._ifElse_;
    }

    public void setIfElse(PIfElse node)
    {
        if(this._ifElse_ != null)
        {
            this._ifElse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifElse_ = node;
    }

    public TFimSe getFimSe()
    {
        return this._fimSe_;
    }

    public void setFimSe(TFimSe node)
    {
        if(this._fimSe_ != null)
        {
            this._fimSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimSe_ = node;
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
            + toString(this._se_)
            + toString(this._abreParenteses_)
            + toString(this._expLogica_)
            + toString(this._fechaParenteses_)
            + toString(this._entao_)
            + toString(this._cmdSequence_)
            + toString(this._ifElse_)
            + toString(this._fimSe_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
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

        if(this._entao_ == child)
        {
            this._entao_ = null;
            return;
        }

        if(this._cmdSequence_ == child)
        {
            this._cmdSequence_ = null;
            return;
        }

        if(this._ifElse_ == child)
        {
            this._ifElse_ = null;
            return;
        }

        if(this._fimSe_ == child)
        {
            this._fimSe_ = null;
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
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
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

        if(this._entao_ == oldChild)
        {
            setEntao((TEntao) newChild);
            return;
        }

        if(this._cmdSequence_ == oldChild)
        {
            setCmdSequence((PCmdSequence) newChild);
            return;
        }

        if(this._ifElse_ == oldChild)
        {
            setIfElse((PIfElse) newChild);
            return;
        }

        if(this._fimSe_ == oldChild)
        {
            setFimSe((TFimSe) newChild);
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
