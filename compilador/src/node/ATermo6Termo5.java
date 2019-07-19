/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ATermo6Termo5 extends PTermo5
{
    private PTermo6 _termo6_;

    public ATermo6Termo5()
    {
        // Constructor
    }

    public ATermo6Termo5(
        @SuppressWarnings("hiding") PTermo6 _termo6_)
    {
        // Constructor
        setTermo6(_termo6_);

    }

    @Override
    public Object clone()
    {
        return new ATermo6Termo5(
            cloneNode(this._termo6_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATermo6Termo5(this);
    }

    public PTermo6 getTermo6()
    {
        return this._termo6_;
    }

    public void setTermo6(PTermo6 node)
    {
        if(this._termo6_ != null)
        {
            this._termo6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo6_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._termo6_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._termo6_ == child)
        {
            this._termo6_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._termo6_ == oldChild)
        {
            setTermo6((PTermo6) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
