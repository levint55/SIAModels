package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.InfoMataKuliah;
import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.matakuliah.interfaces.*;
import id.ac.unpar.siamodels.Mahasiswa;

import java.util.List;


@InfoMataKuliah(nama = "Sistem Multi Agen", sks = 2)
public class AIF184116_02 extends MataKuliah implements HasPrasyarat{

    @Override
    public boolean checkPrasyarat(Mahasiswa mahasiswa, List<String> reasonsContainer) {
        boolean ok = true;
        if (!mahasiswa.hasTempuhKuliah("AIF182206-03") && !mahasiswa.hasTempuhKuliah("AIF183100-03")) {
            reasonsContainer.add("Tidak memenuhi prasyarat tempuh AIF182206-03 atau AIF183100-03");
            ok = false;
        }
        return ok;
    }
}
