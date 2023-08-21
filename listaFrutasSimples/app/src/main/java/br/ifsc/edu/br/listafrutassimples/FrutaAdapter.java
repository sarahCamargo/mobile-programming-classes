package br.ifsc.edu.br.listafrutassimples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.awt.font.NumericShaper;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

class FrutaAdapter extends ArrayAdapter {
    Context mContext;
    int mRecurso;

    public FrutaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mRecurso = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mRecurso,parent,false);

        TextView tvCodigo = convertView.findViewById(R.id.tvCodigo);
        TextView tvNome = convertView.findViewById(R.id.tvNome);
        TextView tvPreco = convertView.findViewById(R.id.tvPreco);
        TextView tvPrecoVenda = convertView.findViewById(R.id.tvPrecoVenda);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        Fruta fruta = (Fruta) getItem(position);
        NumberFormat nf = new DecimalFormat("#,###.00");

        tvCodigo.setText(Integer.toString(fruta.getCodigo()));
        tvNome.setText((fruta.getNome()));
        tvPreco.setText(nf.format(fruta.getPreco()));
        tvPrecoVenda.setText(nf.format(fruta.getPreco_venda()));
        imageView.setImageResource(fruta.getImagem());

        return convertView;
    }
}
