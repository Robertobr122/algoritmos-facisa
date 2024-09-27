/* 
package lista;

public class ListaEncadeada<T> {
        private No<T> inicio;
        private No<T> ultimo;
        private int tamanho = 0;

        public void adiciona (T elemento){
            No<T> celula = new No<T>(elemento);
            if(this.tamanho == 0){
                this.inicio = celula;
            }else{
                this.ultimo.setProximo(celula);
            }
            this.ultimo = celula;
            this.tamanho++;
        }
        public int getTamanho(){
                return this.tamanho;
        }
        public void adicionaInicio (T elemento){
            No<T> novoNo = new No<>(elemento);
            if(this.tamanho == 0){
                this.inicio = novoNo;
                this.ultimo = novoNo;
            }else{
                novoNo.setProximo(this.inicio);
                this.inicio = novoNo;
            }
            this.tamanho++;
        }
        public T removeFinal(){
            if(this.tamanho ==0){
                throw new RuntimeException("Lista vazia");
            }
            if(this.tamanho == 1){
                this.removeInicio();
            }
            No<T> penultimoNo = this.buscaNo(this.tamanho- 2);
            T removido = penultimoNo.getProximo().getElemento();
            penultimoNo.setProximo(null);
            this.ultimo = penultimoNo;
            this.tamanho--;
            return removido;
        }
        public void adiciona(int posicao, T elemento){

            if(posicao < 0 || posicao> this.tamanho){
                throw new IllegalArgumentException(("Posicao invalida"));
            }
            if(posicao == 0){
                this.adicionaInicio(elemento);
            }else if(posicao == this.tamanho){
                this.adiciona(elemento);
            }else{
                No<T> noAnterior = this.buscaNo(posicao);
                No<T> proximoNo = noAnterior.getProximo();
                No<T> novoNo = new No<>(elemento, proximoNo);
                noAnterior.setProximo(novoNo);
                this.tamanho++;
            }
        }
        public T removeInicio(){
         if(this.tamanho ==0){
             throw new RuntimeException("Lista vazia");
         }
         T removido = this.inicio.getElemento();
         this.inicio = this.inicio.getProximo();
         this.tamanho --;
         if(this.tamanho == 0){
             this.ultimo =null;

         }
         return removido;

        }
        public T remove(int posicao) {
            if(!(posicao >= 0 && posicao <= this.tamanho)){
                throw new IllegalArgumentException("Posicao Inválida");
            }
            if(posicao == 0){
                return this.removeInicio();
            }
            if(posicao == this.tamanho -1){
                return this.removeFinal();
            }
            No<T> noAnteior = this.buscaNo(posicao-1);
            No<T> atual = noAnteior.getProximo();
            No<T> proximo = atual.getProximo();
            noAnteior.setProximo(proximo);
            atual.setProximo(null);
            this.tamanho--;
            return null;
        }
        private No<T> buscaNo(int posicao){
            if(!(posicao >= 0 && posicao <= this.tamanho)){
                throw new IllegalArgumentException("Posicao nao existe.");
            }
            No<T> noAtual = this.inicio;
            for(int i =0; i < posicao; i++){
                noAtual = noAtual.getProximo();
            }
            return noAtual;
        }
        public T buscaPorPosicao(int posicao){

            return this.buscaNo(posicao).getElemento();
        }
        public int busca(T elemento) {
            int posicao = 0;
            for (No<T> atual = this.inicio; atual != null; atual = atual.getProximo()) {
                if (atual.getElemento().equals(elemento)) {
                    return posicao;
                }
                posicao++;
            }
            return -1;
        }

        public void limpa(){
            // proprio garbage collection  em O(N)
            for (No<T> atual = this.inicio; atual != null; ){
                No<T> proximo = atual.getProximo();
                atual.setElemento(null);
                atual.setProximo(null);
                atual = proximo;
            }
            this.inicio = null;
            this.ultimo = null;
            this.tamanho = 0;
        }

        @Override
        public String toString() {
            if(this.tamanho == 0){
                return "[]";
            }
            StringBuilder builder = new StringBuilder("[");
            No<T> atual =this.inicio;

            for (int i = 0; i < this.tamanho -1; i++){
                builder.append(atual.getElemento()).append(',');
                atual = atual.getProximo();
            }
            builder.append(atual.getElemento()).append("]");

            return builder.toString();
        }
}
*/