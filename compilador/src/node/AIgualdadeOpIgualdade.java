/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIgualdadeOpIgualdade extends POpIgualdade
{
    private TIgualdade _igualdade_;

    public AIgualdadeOpIgualdade()
    {
        // Constructor
    }

    public AIgualdadeOpIgualdade(
        @SuppressWarnings("hiding") TIgualdade _igualdade_)
    {
        // Constructor
        setIgualdade(_igualdade_);

    }

    @Override
    public Object clone()
    {
        return new AIgualdadeOpIgualdade(
            cloneNode(this._igualdade_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIgualdadeOpIgualdade(this);
    }

    public TIgualdade getIgualdade()
    {
        return this._igualdade_;
    }

    public void setIgualdade(TIgualdade node)
    {
        if(this._igualdade_ != null)
        {
            this._igualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igualdade_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._igualdade_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._igualdade_ == child)
        {
            this._igualdade_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._igualdade_ == oldChild)
        {
            setIgualdade((TIgualdade) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
