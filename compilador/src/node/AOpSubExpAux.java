/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AOpSubExpAux extends PExpAux
{
    private PExpAux _left_;
    private PExpAux _right_;

    public AOpSubExpAux()
    {
        // Constructor
    }

    public AOpSubExpAux(
        @SuppressWarnings("hiding") PExpAux _left_,
        @SuppressWarnings("hiding") PExpAux _right_)
    {
        // Constructor
        setLeft(_left_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AOpSubExpAux(
            cloneNode(this._left_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpSubExpAux(this);
    }

    public PExpAux getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpAux node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PExpAux getRight()
    {
        return this._right_;
    }

    public void setRight(PExpAux node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpAux) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpAux) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
