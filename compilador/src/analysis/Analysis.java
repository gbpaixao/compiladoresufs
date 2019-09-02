/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStart(AStart node);
    void caseAVarDeclaracao(AVarDeclaracao node);
    void caseAConstDeclaracao(AConstDeclaracao node);
    void caseAFloatTipo(AFloatTipo node);
    void caseAIntTipo(AIntTipo node);
    void caseACharTipo(ACharTipo node);
    void caseAIdVar(AIdVar node);
    void caseAVetorVar(AVetorVar node);
    void caseAStringValor(AStringValor node);
    void caseAIntValor(AIntValor node);
    void caseAFloatValor(AFloatValor node);
    void caseAAtribuicaoComando(AAtribuicaoComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseAEscrevaComando(AEscrevaComando node);
    void caseASeComando(ASeComando node);
    void caseASeElseComando(ASeElseComando node);
    void caseAAvalieComando(AAvalieComando node);
    void caseAAvalieElseComando(AAvalieElseComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaComando(ARepitaComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaPassoComando(AParaPassoComando node);
    void caseAIfElse(AIfElse node);
    void caseACase(ACase node);
    void caseACaseElse(ACaseElse node);
    void caseAValorExp(AValorExp node);
    void caseAVarExp(AVarExp node);
    void caseAParentesesExp(AParentesesExp node);
    void caseAMenosExp(AMenosExp node);
    void caseAOpSumExp(AOpSumExp node);
    void caseAOpSubExp(AOpSubExp node);
    void caseAOpMultExp(AOpMultExp node);
    void caseAOpDivExp(AOpDivExp node);
    void caseAParentesesExpLogica(AParentesesExpLogica node);
    void caseAOpIgualExpLogica(AOpIgualExpLogica node);
    void caseAOpDifExpLogica(AOpDifExpLogica node);
    void caseAOpMaiorExpLogica(AOpMaiorExpLogica node);
    void caseAOpMenorExpLogica(AOpMenorExpLogica node);
    void caseAOpMaiorIgualExpLogica(AOpMaiorIgualExpLogica node);
    void caseAOpMenorIgualExpLogica(AOpMenorIgualExpLogica node);
    void caseANaoExpLogica(ANaoExpLogica node);
    void caseAEExpLogica(AEExpLogica node);
    void caseAOuExpLogica(AOuExpLogica node);
    void caseAXorExpLogica(AXorExpLogica node);
    void caseAValorExpAux(AValorExpAux node);
    void caseAVarExpAux(AVarExpAux node);
    void caseAParentesesExpAux(AParentesesExpAux node);
    void caseAMenosExpAux(AMenosExpAux node);
    void caseAOpSumExpAux(AOpSumExpAux node);
    void caseAOpSubExpAux(AOpSubExpAux node);
    void caseAOpMultExpAux(AOpMultExpAux node);
    void caseAOpDivExpAux(AOpDivExpAux node);

    void caseTAvalie(TAvalie node);
    void caseTAte(TAte node);
    void caseTBooleano(TBooleano node);
    void caseTCaractere(TCaractere node);
    void caseTCaso(TCaso node);
    void caseTConstante(TConstante node);
    void caseTDe(TDe node);
    void caseTEntao(TEntao node);
    void caseTEnquanto(TEnquanto node);
    void caseTEscreva(TEscreva node);
    void caseTFaca(TFaca node);
    void caseTFalso(TFalso node);
    void caseTFim(TFim node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTFimPara(TFimPara node);
    void caseTFimSe(TFimSe node);
    void caseTInicio(TInicio node);
    void caseTInteiro(TInteiro node);
    void caseTLeia(TLeia node);
    void caseTPara(TPara node);
    void caseTPasso(TPasso node);
    void caseTPrograma(TPrograma node);
    void caseTReal(TReal node);
    void caseTRepita(TRepita node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTAbreColchete(TAbreColchete node);
    void caseTAbreParenteses(TAbreParenteses node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTDoisPontosIgual(TDoisPontosIgual node);
    void caseTEnter(TEnter node);
    void caseTEspaco(TEspaco node);
    void caseTFechaColchete(TFechaColchete node);
    void caseTFechaParenteses(TFechaParenteses node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTTab(TTab node);
    void caseTVirgula(TVirgula node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTVezes(TVezes node);
    void caseTDividido(TDividido node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIgualdade(TIgualdade node);
    void caseTDiferenca(TDiferenca node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTMenorQue(TMenorQue node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTId(TId node);
    void caseTInt(TInt node);
    void caseTFloat(TFloat node);
    void caseTString(TString node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentarioBlocoAbre(TComentarioBlocoAbre node);
    void caseTComentarioBlocoMeio(TComentarioBlocoMeio node);
    void caseTComentarioStar(TComentarioStar node);
    void caseTComentarioSlash(TComentarioSlash node);
    void caseTComentarioBlocoFecha(TComentarioBlocoFecha node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
