/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclaracao(AVarDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatTipo(AFloatTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipo(AIntTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACharTipo(ACharTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFloatValor(AFloatValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAtribuicaoComando(AAtribuicaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeElseComando(ASeElseComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieElseComando(AAvalieElseComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElse(AIfElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACase(ACase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaseElse(ACaseElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExp(AVarExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesExp(AParentesesExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpSumExp(AOpSumExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpSubExp(AOpSubExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMultExp(AOpMultExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpDivExp(AOpDivExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesExpLogica(AParentesesExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpIgualExpLogica(AOpIgualExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpDifExpLogica(AOpDifExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMaiorExpLogica(AOpMaiorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMenorExpLogica(AOpMenorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMaiorIgualExpLogica(AOpMaiorIgualExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMenorIgualExpLogica(AOpMenorIgualExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANaoExpLogica(ANaoExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorExpAux(AValorExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarExpAux(AVarExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParentesesExpAux(AParentesesExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpAux(AMenosExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpSumExpAux(AOpSumExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpSubExpAux(AOpSubExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpMultExpAux(AOpMultExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOpDivExpAux(AOpDivExpAux node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdadeiro(TVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreColchete(TAbreColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAbreParenteses(TAbreParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontosIgual(TDoisPontosIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnter(TEnter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEspaco(TEspaco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaColchete(TFechaColchete node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFechaParenteses(TFechaParenteses node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVezes(TVezes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDividido(TDividido node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgualdade(TIgualdade node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferenca(TDiferenca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorQue(TMaiorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorQue(TMenorQue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioLinha(TComentarioLinha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBlocoAbre(TComentarioBlocoAbre node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBlocoMeio(TComentarioBlocoMeio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioStar(TComentarioStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioSlash(TComentarioSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioBlocoFecha(TComentarioBlocoFecha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
