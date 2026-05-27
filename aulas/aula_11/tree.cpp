#include <iostream>
#include <cstdlib>

using namespace std;


typedef struct node
{
    int valor;
    struct node *esq;
    struct node *dir;
} Tree;

Tree *inserir(int valor, Tree *root) {
    if (root) {
        if (valor < root->valor) {
            root->esq = inserir(valor, root->esq);
        } else {
            root->dir = inserir(valor, root->dir);
        }

    } else {
        //alocar memória
        Tree *novo = (Tree*)malloc(sizeof(Tree));
        //depositar valores
        novo->valor = valor;
        novo->esq = NULL;
        novo->dir = NULL;
        //retornar elemento criado
        return novo;
    }
}

void red(Tree *root) {
    if (root) {
        cout << root->valor << endl;
        red(root->esq);
        red(root->dir);
    }
}

void erd(Tree *root) {
    if (root) {
        erd(root->esq);
        cout << root->valor << endl;
        erd(root->dir);
    }
}

void edr(Tree *root) {
    if (root) {
        edr(root->esq);
        edr(root->dir);
        cout << root->valor << endl;
    }
}

void exibir(Tree *root, int nivel) {
    if (root) {
        //tudo para a direita
        exibir(root->dir, nivel+1);

        //exibir o node dentro do seu nível
        for(int i = 0; i < nivel; i++) {
            cout << "   ";
        }
        cout << root->valor << "(" << nivel << ")" << endl;

        //tudo para a esquerda
        exibir(root->esq, nivel+1);
    }
}

int contarNodes(Tree *root) {
    if (root) {
        return 1 + contarNodes(root->esq) + contarNodes(root->dir);
    }
    return 0;
}

int contarNodesPares(Tree *root) {
    if (root) {
        if (root->valor % 2 == 0) {
            return 1 + contarNodesPares(root->esq) + contarNodesPares(root->dir);
        } else {
            return 0 + contarNodesPares(root->esq) + contarNodesPares(root->dir);
        }
    }
    return 0;
}

int contarLeafNode(Tree *root) {
    if (root) {
        if (!root->esq && !root->dir) {
            return 1 + contarLeafNode(root->esq) + contarLeafNode(root->dir);
        } else {
            return 0 + contarLeafNode(root->esq) + contarLeafNode(root->dir);
        }
    }
    return 0;
}

int contarNotLeafNode(Tree *root) {
    if (root) {
        if (root->esq || root->dir) {
            return 1 + contarNotLeafNode(root->esq) + contarNotLeafNode(root->dir);
        }
    }
    return 0;
}

int contido(int valor, Tree *root) {
    if (root) {
        if (root->valor == valor) {
            return 1;
        } else {
            return 0 + contido(valor, root->esq) + contido(valor, root->dir);
        }
    }
    return 0;
}

int main() {
    Tree *root = NULL;
    
    root = inserir(100, root);
    root = inserir(55, root);
    root = inserir(215, root);
    root = inserir(25, root);
    root = inserir(70, root);
    root = inserir(250, root);
    root = inserir(150, root);
    root = inserir(30, root);
    root = inserir(15, root);

    red(root);
    cout << endl;
    erd(root);
    cout << endl;
    edr(root);
    cout << endl;

    exibir(root, 0);
    cout << endl;

    cout << "Total de elementos: " << contarNodes(root) << endl;
    cout << "Total de elementos pares: " << contarNodesPares(root) << endl;
    cout << "Total de leaf nodes: " << contarLeafNode(root) << endl;
    cout << "Total de nodes que não são leaves: " << contarNotLeafNode(root) << endl;
    cout << "O número 7 está contido na tree? " << contido(7, root) << endl;
    cout << "O número 150 está contido na tree? " << contido(150, root) << endl;

    return 1;
}
