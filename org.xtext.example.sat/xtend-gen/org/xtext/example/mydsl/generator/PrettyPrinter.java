/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.sat.And;
import org.xtext.example.mydsl.sat.BiImpl;
import org.xtext.example.mydsl.sat.Expression;
import org.xtext.example.mydsl.sat.Impl;
import org.xtext.example.mydsl.sat.Nand;
import org.xtext.example.mydsl.sat.Not;
import org.xtext.example.mydsl.sat.Or;

@SuppressWarnings("all")
public class PrettyPrinter {
  public static String PrettyPrint(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      String _PrettyPrint = PrettyPrinter.PrettyPrint(((BiImpl) e).getLeft());
      String _plus = (_PrettyPrint + " <=> ");
      String _PrettyPrint_1 = PrettyPrinter.PrettyPrint(((BiImpl) e).getRight());
      return (_plus + _PrettyPrint_1);
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        String _PrettyPrint_2 = PrettyPrinter.PrettyPrint(((Impl) e).getLeft());
        String _plus_1 = (_PrettyPrint_2 + " => ");
        String _PrettyPrint_3 = PrettyPrinter.PrettyPrint(((Impl) e).getRight());
        return (_plus_1 + _PrettyPrint_3);
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        String _PrettyPrint_4 = PrettyPrinter.PrettyPrint(((Or) e).getLeft());
        String _plus_2 = (_PrettyPrint_4 + " v ");
        String _PrettyPrint_5 = PrettyPrinter.PrettyPrint(((Or) e).getRight());
        return (_plus_2 + _PrettyPrint_5);
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        String _PrettyPrint_6 = PrettyPrinter.PrettyPrint(((And) e).getLeft());
        String _plus_3 = (_PrettyPrint_6 + " ^ ");
        String _PrettyPrint_7 = PrettyPrinter.PrettyPrint(((And) e).getRight());
        return (_plus_3 + _PrettyPrint_7);
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        String _PrettyPrint_8 = PrettyPrinter.PrettyPrint(((Nand) e).getLeft());
        String _plus_4 = (_PrettyPrint_8 + " ↑ ");
        String _PrettyPrint_9 = PrettyPrinter.PrettyPrint(((Nand) e).getRight());
        return (_plus_4 + _PrettyPrint_9);
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        String _PrettyPrint_10 = PrettyPrinter.PrettyPrint(((Not) e).getExpression());
        return ("!" + _PrettyPrint_10);
      }
    }
    if (!_matched) {
      String _xifexpression = null;
      String _id = e.getId();
      boolean _tripleEquals = (_id == null);
      if (_tripleEquals) {
        _xifexpression = e.getVal().toString();
      } else {
        _xifexpression = e.getId().toString();
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  public static String PrettyPrintCNF(final Expression e) {
    String _switchResult = null;
    boolean _matched = false;
    if ((e instanceof BiImpl)) {
      _matched=true;
      String _PrettyPrintCNF = PrettyPrinter.PrettyPrintCNF(((BiImpl) e).getLeft());
      String _plus = (_PrettyPrintCNF + " <=> ");
      String _PrettyPrintCNF_1 = PrettyPrinter.PrettyPrintCNF(((BiImpl) e).getRight());
      return (_plus + _PrettyPrintCNF_1);
    }
    if (!_matched) {
      if ((e instanceof Impl)) {
        _matched=true;
        String _PrettyPrintCNF_2 = PrettyPrinter.PrettyPrintCNF(((Impl) e).getLeft());
        String _plus_1 = (_PrettyPrintCNF_2 + " => ");
        String _PrettyPrintCNF_3 = PrettyPrinter.PrettyPrintCNF(((Impl) e).getRight());
        return (_plus_1 + _PrettyPrintCNF_3);
      }
    }
    if (!_matched) {
      if ((e instanceof Or)) {
        _matched=true;
        String _PrettyPrintCNF_4 = PrettyPrinter.PrettyPrintCNF(((Or) e).getLeft());
        String _plus_2 = (_PrettyPrintCNF_4 + " v ");
        String _PrettyPrintCNF_5 = PrettyPrinter.PrettyPrintCNF(((Or) e).getRight());
        return (_plus_2 + _PrettyPrintCNF_5);
      }
    }
    if (!_matched) {
      if ((e instanceof And)) {
        _matched=true;
        String _PrettyPrintCNF_6 = PrettyPrinter.PrettyPrintCNF(((And) e).getLeft());
        String _plus_3 = ("(" + _PrettyPrintCNF_6);
        String _plus_4 = (_plus_3 + ") ^ (");
        String _PrettyPrintCNF_7 = PrettyPrinter.PrettyPrintCNF(((And) e).getRight());
        String _plus_5 = (_plus_4 + _PrettyPrintCNF_7);
        return (_plus_5 + ")");
      }
    }
    if (!_matched) {
      if ((e instanceof Nand)) {
        _matched=true;
        String _PrettyPrintCNF_8 = PrettyPrinter.PrettyPrintCNF(((Nand) e).getLeft());
        String _plus_6 = (_PrettyPrintCNF_8 + " ↑ ");
        String _PrettyPrintCNF_9 = PrettyPrinter.PrettyPrintCNF(((Nand) e).getRight());
        return (_plus_6 + _PrettyPrintCNF_9);
      }
    }
    if (!_matched) {
      if ((e instanceof Not)) {
        _matched=true;
        String _PrettyPrintCNF_10 = PrettyPrinter.PrettyPrintCNF(((Not) e).getExpression());
        return ("!" + _PrettyPrintCNF_10);
      }
    }
    if (!_matched) {
      String _xifexpression = null;
      String _id = e.getId();
      boolean _tripleEquals = (_id == null);
      if (_tripleEquals) {
        _xifexpression = e.getVal().toString();
      } else {
        _xifexpression = e.getId().toString();
      }
      _switchResult = _xifexpression;
    }
    return _switchResult;
  }
  
  public static String Simpl_Print_CNF(final Expression e) {
    String s = PrettyPrinter.PrettyPrintCNF(e);
    String s1 = s.replaceAll("[(]+", "(");
    return s1.replaceAll("[)]+", ")");
  }
}